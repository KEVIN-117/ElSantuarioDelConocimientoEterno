import { PetClass } from "./class";


PetClass.extend({
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
        addPet(form) {
            const context = this
            context.set(form)
            context.save()
        },
        getPet(id){
            let getPub =PetClass.findOne({_id:id}, {fields:{petType:1, name:1, sumary:1, body:1}})
            return getPub
            
        },
        editPets(form) {
            //console.log(form)
            const context = PetClass.findOne({_id:new Meteor.Collection.ObjectID(form._id)})
            delete form._id
            if(!form.image){
                delete form.image
            }
            context.set(form)
            context.save()
        },
        deletePets(id) {
            //console.log(form)
            const context = PetClass.findOne({_id:id})
            context.active = false
            context.save()
        }
    }
})


class queryFoot{
    getPetSimple(){
        let query={
            filters:{active:true},
            projection:{
                fields:{petType:1, name:1, sumary:1}
            }
        }
        return query
    }
}
Meteor.publish('pet', function(type){
    //console.log(PetClass.find({}).count())
    const qp = new queryFoot()
    let query = qp[type]()
    return PetClass.find(query.filters, query.projection);
})
