import { Class } from 'meteor/jagi:astronomy';
const Food = new Mongo.Collection('food',{idGeneration:'MONGO'});

export const FoodClass = Class.create({
  name: 'FoodClass',
  collection: Food,
  fields: {
    petType:{
        type: String,
    },
    name: {
      type: String,
    },
    quantityAvailable:{
        type:String,
    },
    priceUnit:{
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