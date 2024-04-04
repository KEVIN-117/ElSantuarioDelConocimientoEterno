import { FoodClass } from "./class";


FoodClass.extend({
    behaviors: {
        slug: {
          fieldName: 'title',
          helperName: null,
          slugFieldName: 'slug',
          canUpdate: true,
          unique: true,
          separator: '-'
        },
        timestamp: {
            hasCreatedField: true,
            createdFieldName: 'createdAt',
            hasUpdatedField: true,
            updatedFieldName: 'updatedAt'
        },
        
    },
    
    meteorMethods: {
        addFoots(form) {
            const context = this
            context.set(form)
            context.save()
        },
        getFood(id){
            let getPub =FoodClass.findOne({_id:id}, {fields:{petType:1, name:1, quantityAvailable:1, priceUnit:1, body:1}})
            return getPub
        },
        editFoods(form) {
            //console.log(form)
            const context = FoodClass.findOne({_id:new Meteor.Collection.ObjectID(form._id)})
            delete form._id
            if(!form.image){
                delete form.image
            }
            context.set(form)
            context.save()
        },
        deleteFoods(id) {
            //console.log(form)
            const context = FoodClass.findOne({_id:id})
            context.active = false
            context.save()
        }
    }
})


class queryFoot{
    getFoodSimple(){
        let query={
            filters:{active:true},
            projection:{
                fields:{petType:1, name:1, quantityAvailable:1}
            }
        }
        return query
    }
}
Meteor.publish('food', function(type){
    //console.log(FoodClass.find({}).count())
    const qp = new queryFoot()
    let query = qp[type]()
    return FoodClass.find(query.filters, query.projection);
})
