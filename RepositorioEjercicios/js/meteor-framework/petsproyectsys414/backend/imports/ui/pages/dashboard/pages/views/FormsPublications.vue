vue.<template>
    <div>
        <form @submit.prevent="submitForm">
            <md-card>
                <md-card-header :data-background-color="dataBackgroundColor">
                    <h4 class="title">{{dataEdit?'Editar':'Crear'}} Publicacion</h4>
                    <p class="category">Este Formulario sirve para {{dataEdit?'editar':'crear'}} una nueva publicacion</p>
                </md-card-header>

                <md-card-content>
                    <div class="md-layout">
                        <div class="md-layout-item md-small-size-100 md-size-33">
                            <md-field>
                                <label>Titulo</label>
                                <md-input type="text" v-model="form.title"></md-input>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100 md-size-33">
                            <md-field>
                                <label>Resumen</label>
                                <md-input  type="text" v-model="form.summary"></md-input>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100 md-size-33">
                            <md-field>
                                <label>Imagen</label>
                                <md-file v-model="form.image" @md-change="buildImage($event)" placeholder="Imagen de publicacion" />
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100 md-size-100">
                            <md-field>
                                <label>Contenido</label>
                                <md-textarea v-model="form.body"></md-textarea>
                            </md-field>
                        </div>
                        
                        <div class="md-layout-item md-size-100 text-right">
                            <md-button type="submit" class="md-raised md-success">{{dataEdit?'Editar':'Crear'}} Publicacion</md-button>
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
                title:null,
                summary:null,
                image:null,
                body:null,
            }
        }
    },
    methods: {
        submitForm(){
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
                title:this.dataEdit.title,
                summary:this.dataEdit.summary,
                body:this.dataEdit.body,
            }
        }
    },
}
</script>
<style >
    
</style>