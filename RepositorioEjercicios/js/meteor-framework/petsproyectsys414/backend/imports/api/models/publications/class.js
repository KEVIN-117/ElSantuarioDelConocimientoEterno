import { Class } from 'meteor/jagi:astronomy';
const Publications = new Mongo.Collection('publications',{idGeneration:'MONGO'});

export const PublicationsClass = Class.create({
  name: 'PublicationsClass',
  collection: Publications,
  fields: {
    title: {
      type: String,
    },
    summary:{
        type:String,
    },
    body:{
        type:String,
    },
    active:{
      type:Boolean,
      default: true,
    },
    image:{
        type:String,
    }
  }
});

