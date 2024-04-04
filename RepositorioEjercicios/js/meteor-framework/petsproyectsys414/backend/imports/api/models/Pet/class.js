
import { Class } from 'meteor/jagi:astronomy';
const Pet = new Mongo.Collection('pet',{idGeneration:'MONGO'});

export const PetClass = Class.create({
  name: 'PetClass',
  collection: Pet,
  fields: {
    petType:{
        type: String,
    },
    name: {
      type: String,
    },
    sumary:{
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