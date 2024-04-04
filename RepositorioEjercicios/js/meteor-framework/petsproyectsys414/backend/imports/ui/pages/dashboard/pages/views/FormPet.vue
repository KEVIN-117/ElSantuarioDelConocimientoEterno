<template>
    <div>
        <form @submit.prevent="submitForm">
            <md-card>
                <md-card-header :data-background-color="dataBackgroundColor">
                    <h4 class="title">{{dataEdit?'Editar':'Añadir'}} Mascotas</h4>
                    <p class="category">Este Formulario sirve {{dataEdit?'editar':'añadir'}} Mascotas</p>
                </md-card-header>

                <md-card-content>
                    <div class="md-layout">
                        <div class="md-layout-item md-small-size-100 md-size-33">
                            <md-field>
                                <label for="mascotas">Mascota</label>
                                <md-select v-model="form.petType" name="mascotas" id="mascotas" md-dense>
                                    <md-option value="Gatos">Gato</md-option>
                                    <md-option value="Perros">Perro</md-option>
                                </md-select>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100 md-size-33">
                            <md-field>
                            <label>Nombre</label>
                            <md-input v-model="form.name" type="text"></md-input>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100 md-size-33">
                            <md-field>
                            <label>Resumen de Historia</label>
                            <md-input v-model="form.sumary" type="text"></md-input>
                            </md-field>
                        </div>
                        
                        <div class="md-layout-item md-small-size-100 md-size-100">
                            <md-field>
                                <label>Imagen de Mascota</label>
                                <md-file v-model="form.image" @md-change="buildImage($event)" placeholder="Imagen de mascota"/>
                            </md-field>
                        </div>

                        <div class="md-layout-item md-small-size-100 md-size-100">
                            <md-field>
                                <label>Historia</label>
                                <md-textarea v-model="form.body"></md-textarea>
                            </md-field>
                        </div>
                        
                        <div class="md-layout-item md-size-100 text-right">
                            <md-button type="submit" class="md-raised md-success">{{dataEdit?'Editar':'Añadir'}} Mascota</md-button>
                        </div>
                    </div>
                </md-card-content>
            </md-card>
        </form>
    </div>
</template>
<script>
import {convertToBase64} from '../../../../../helpers/helper.js'
export default {
    props:{
        methodCreateOrEdit:Function,
        dataEdit:Object
    },
    data() {
        return {
            dataBackgroundColor: 'green',
            form:{ 
                petType:null,
                name:null,
                sumary:null,
                image:null,
                body:null,
            }
        }
    },
    methods: {
        submitForm(){
            console.log(this.form)
            this.methodCreateOrEdit(this.form)
        },
        buildImage(files){
            let context = this
            convertToBase64(files[0], function (error, result) {
                if(!error){
                    context.form.image = result 
                }
            })
        },
    },
    mounted() {
        if(this.dataEdit){
            this.form = {
                _id:this.dataEdit._id._str,
                petType:this.dataEdit.petType,
                name:this.dataEdit.name,
                quantityAvailable:this.dataEdit.quantityAvailable,
                priceUnit:this.dataEdit.priceUnit,
                body:this.dataEdit.body,
            }
        }
    },
}
</script>
<style>
    
</style>