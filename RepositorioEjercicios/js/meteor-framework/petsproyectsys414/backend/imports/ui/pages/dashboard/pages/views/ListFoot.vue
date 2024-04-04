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
                  <md-table-cell md-label="Cantidad">{{ item.quantityAvailable }}</md-table-cell>
                  
                  <md-table-cell>
                    <md-button class="md-just-icon md-simple md-primary" @click="showEditFoot(item._id)">
                      <md-icon>edit</md-icon>
                      <md-tooltip md-direction="top">Editar</md-tooltip>
                    </md-button>
                    <md-button class="md-just-icon md-simple md-danger" @click="deleteFoods(item._id)">
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
          <FormFoot :methodCreateOrEdit="editFoots" :dataEdit="dataEdit"/>
        </div>
    </md-dialog>

  </div>
</template>
<script>
  import {FoodClass} from '../../../../../api/models/food/class'
  import {SimpleTable, OrderedTable } from "../../components";
  import FormFoot from './FormFoot.vue'
  import Vue from 'vue'
  export default {
      components:{
        SimpleTable
      },
      data() {
        return {
          showDialog:false,
          dataEdit:{}
        }
      },
      components:{
        SimpleTable,
        FormFoot
      },
      methods: {
        showEditFoot(idpub){
          const context = this
          const newFood = new FoodClass
          newFood.callMethod('getFood', idpub, (err, result) => {
            if(err){
              alert(JSON.stringify(err))
            }else{
              context.dataEdit = result
              context.showDialog = true
            }
          });
        },
        editFoots(form){
          const newFood= new FoodClass
          newFood.callMethod('editFoods', form, (err, result) => {
            if(err){
              alert(JSON.stringify(err))
            }else{
              this.showDialog = false
              Vue.swal({
                position: 'top-end',
                icon: 'success',
                title: 'Editado correctamente',
                showConfirmButton: false,
              })
            }
          });
        },
        deleteFoods(idpub){
          const newFood= new FoodClass
          newFood.callMethod('deleteFoods', idpub, (err, result) => {
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
        'food': ['getFoodSimple']
      },
      getAllPublications(){
        let getpublications = FoodClass.find()
        //console.log(getpublications.fetch())
        return getpublications
      }
    }
  }
</script>
<style >
</style>