import { Post } from "./class";

Meteor.publish('Publication_Post', function(){
    return Post.find({});
})

Meteor.startup(() => {
    
})