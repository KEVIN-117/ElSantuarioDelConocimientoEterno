import {Class} from 'meteor/jagi:astronomy'

const Posts = new  Mongo.Collection('posts', {idGeneration:'MONGO'});

export const Post = Class.created({
    name: 'Post',
    Collection: Posts,
    fields:{
        title:{
            type:String,
        }
    }
});