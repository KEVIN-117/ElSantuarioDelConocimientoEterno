<template >
    <div class="content">
        <div class="md-layout">
          <div class="md-layout-item md-medium-size-100 md-size-90">
            <md-card>
              <md-card-header data-background-color="green">
                <h4 class="title">Listar Alimetos</h4>
                <p class="category">Lista de alimentos</p>
              </md-card-header>
              <md-card-content>
                <md-table v-model="getAllPublications" :table-header-color="'green'">
                  <md-table-row slot="md-table-row" slot-scope="{ item }">
                    <md-table-cell md-label="Tipo de mascota">{{ item.petType }}</md-table-cell>
                    <md-table-cell md-label="Nombre">{{ item.name }}</md-table-cell>
                    <md-table-cell md-label="Cantidad">{{ item.sumary }}</md-table-cell>
                    
                    <md-table-cell>
                      <md-button class="md-just-icon md-simple md-primary" @click="showEditPet(item._id)">
                        <md-icon>edit</md-icon>
                        <md-tooltip md-direction="top">Editar</md-tooltip>
                      </md-button>
                      <md-button class="md-just-icon md-simple md-danger" @click="deletePets(item._id)">
                        <md-icon>delete</md-icon>
                        <md-tooltip md-direction="top">Eliminar</md-tooltip>
                      </md-button>
                    </md-table-cell>
                  </md-table-row>
                </md-table>
              </md-card-content>
            </md-card>
          </div>
        </div>
  
        <md-dialog :md-active.sync="showDialog">
          <md-dialog-title>Editar Alimento</md-dialog-title>
          <div>
            <FormPet :methodCreateOrEdit="editPets" :dataEdit="dataEdit"/>
          </div>
      </md-dialog>
  
    </div>
  </template>
  <script>
    import {PetClass} from '../../../../../api/models/Pet/class'
    import {SimpleTable, OrderedTable } from "../../components";
    import FormPet from './FormPet.vue'
    import Vue from 'vue'
    export default {
        components:{
          SimpleTable,
          FormPet
        },
        data() {
          return {
            showDialog:false,
            dataEdit:{}
          }
        },
        methods: {
          showEditPet(idpub){
            const context = this
            const newPet = new PetClass
            newPet.callMethod('getPet', idpub, (err, result) => {
              if(err){
                alert(JSON.stringify(err))
              }else{
                context.dataEdit = result
                context.showDialog = true
              }
            });
          },
          editPets(form){
            const newPet= new PetClass
            newPet.callMethod('editPets', form, (err, result) => {
              if(err){
                alert(JSON.stringify(err))
              }else{
                this.showDialog = false
                Vue.swal({
                  position: 'top-end',
                  icon: 'success',
                  title: 'Editado correctamente',
                  showConfirmButton: false,
                  timer: 2500
                })
              }
            });
          },
          deletePets(idpub){
            const newPet= new PetClass
            newPet.callMethod('deletePets', idpub, (err, result) => {
                if(err){
                  alert(JSON.stringify(err))
                }else{
                  Vue.swal({
                    position: 'top-end',
                    icon: 'success',
                    title: 'Borrado correctamente',
                    showConfirmButton: false,
                    timer: 2500
                  })
                }
            });
          },
      },
      meteor:{
        $subscribe:{
          'pet': ['getPetSimple']
        },
        getAllPublications(){
          let getpublications = PetClass.find()
          //console.log(getpublications.fetch())
          return getpublications
        }
      }
    }
  </script>
  <style >
  </style>