<template >
    <div class="content">
      <div class="md-layout">
        <div class="md-layout-item md-medium-size-100 md-size-90">
          <md-card>
            <md-card-header data-background-color="green">
              <h4 class="title">Listar Publicaciones</h4>
              <p class="category">Lista de publicaciones</p>
            </md-card-header>
            <md-card-content>
              <md-table v-model="getAllPublications" :table-header-color="'green'">
                <md-table-row slot="md-table-row" slot-scope="{ item }">
                  <md-table-cell md-label="Titulo">{{ item.title }}</md-table-cell>
                  <md-table-cell md-label="Resumen">{{ item.summary }}</md-table-cell>
                  <md-table-cell md-label="Resumen">{{ item.summary }}</md-table-cell>
                  <md-table-cell>
                    <md-button class="md-just-icon md-simple md-primary" @click="showEditPublications(item._id)">
                      <md-icon>edit</md-icon>
                      <md-tooltip md-direction="top">Editar</md-tooltip>
                    </md-button>
                    <md-button class="md-just-icon md-simple md-danger" @click="deletePublications(item._id)">
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
        <md-dialog-title>Editar Publicacion</md-dialog-title>

        <div>
          <FormPublications :methodCreateOrEdit="editPublications" :dataEdit="dataEdit"/>
        </div>
    </md-dialog>

    </div>
</template>
<script>
  import {PublicationsClass} from '../../../../../api/models/publications/class'
  import FormPublications from './FormsPublications.vue'
  import { SimpleTable, OrderedTable } from "../../components";
  import Vue from 'vue'
  export default {
      data() {
        return {
          showDialog:false,
          dataEdit:{}
        }
      },
      components:{
          SimpleTable,
          FormPublications
      },
      methods: {
        showEditPublications(idpub){
          const context = this
          const newPublication = new PublicationsClass
          newPublication.callMethod('getPublication', idpub, (err, result) => {
            if(err){
              alert(JSON.stringify(err))
            }else{
              context.dataEdit = result
              context.showDialog = true
            }
          });
        },
        //getPublicaton
        editPublications(form){
          const newPublication = new PublicationsClass
          newPublication.callMethod('editPublications', form, (err, result) => {
            if(err){
              alert(JSON.stringify(err))
            }else{
              this.showDialog = false
              Vue.swal({
                position: 'top-end',
                icon: 'success',
                title: 'Editado correctamente',
                showConfirmButton: true,
                timer: 2500
              })
            }
          });
        },
        deletePublications(idpub){
          const newPublication = new PublicationsClass
          newPublication.callMethod('deletePublications', idpub, (err, result) => {
              if(err){
                alert(JSON.stringify(err))
              }else{
                Vue.swal({
                  position: 'top-end',
                  icon: 'success',
                  title: 'Borrado correctamente',
                  showConfirmButton: false,
                })
              }
          });
        },
      },
      
      meteor:{
        $subscribe:{
          'publications': ['getPublicationsSimple']
        },
        getAllPublications(){
          let getpublications = PublicationsClass.find()
          //console.log(getpublications.fetch())
          return getpublications
        }
      }
  }
  </script>
  <style >
      
  </style>