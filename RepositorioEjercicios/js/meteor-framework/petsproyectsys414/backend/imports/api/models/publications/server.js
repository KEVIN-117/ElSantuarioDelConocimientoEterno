import { PublicationsClass } from "./class";


PublicationsClass.extend({
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
        createPublications(form) {
            const context = this
            context.set(form)
            context.save()
        },
        getPublication(id){
            let getPub =PublicationsClass.findOne({_id:id}, {fields:{title:1, summary:1, body:1}})
            return getPub
        },
        editPublications(form) {
            //console.log(form)
            const context = PublicationsClass.findOne({_id:new Meteor.Collection.ObjectID(form._id)})
            delete form._id
            if(!form.image){
                delete form.image
            }
            context.set(form)
            context.save()
        },
        deletePublications(id) {
            //console.log(form)
            const context = PublicationsClass.findOne({_id:id})
            context.active = false
            context.save()
        }
    }
})


class queryPublications{
    getPublicationsSimple(){
        let query={
            filters:{active:true},
            projection:{
                fields:{title:1, summary:1}
            }
        }
        return query
    }
}
Meteor.publish('publications', function(type){
    //console.log(PublicationsClass.find({}).count())
    const qp = new queryPublications()
    let query = qp[type]()
    return PublicationsClass.find(query.filters, query.projection);
})
