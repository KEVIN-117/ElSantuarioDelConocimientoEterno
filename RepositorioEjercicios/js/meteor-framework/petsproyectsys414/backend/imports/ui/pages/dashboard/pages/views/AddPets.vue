<template >
    <div class="content">
      <div class="md-layout">
        <div class="md-layout-item md-medium-size-100 md-size-100">
          <FormPet :methodCreateOrEdit="addPet"/>
        </div>
      </div>
    </div>
  </template>
  <script>
  import {PetClass} from '../../../../../api/models/Pet/class'
  import FormPet from './FormPet.vue'
  import Vue from 'vue'
  export default {
      components:{
        FormPet
      },
      data() {
          return {
              dataBackgroundColor: 'green',
              show: true
          }
      },
      methods: {
          addPet(form){
              const newPet= new PetClass
              newPet.callMethod('addPet', form, (err, result) => {
                  if(err){
                      alert(JSON.stringify(err))
                  }else{
                      Vue.swal({
                          position: 'top-end',
                          icon: 'success',
                          title: 'Añadido correctamente',
                          showConfirmButton: false,
                          timer: 2500
                      })
                  }
              });
          },
      },
  }
  </script>
  <style>
      
  </style>