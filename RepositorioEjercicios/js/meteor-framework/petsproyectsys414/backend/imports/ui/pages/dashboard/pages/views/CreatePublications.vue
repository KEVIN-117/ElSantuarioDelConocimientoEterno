<template >
  <div class="content">
    <div class="md-layout">
      <div class="md-layout-item md-medium-size-100 md-size-100">
        <FormPublications :methodCreateOrEdit="createPublication"/>
      </div>
    </div>
  </div>
</template>
<script>
import {PublicationsClass} from '../../../../../api/models/publications/class'
import FormPublications from './FormsPublications.vue'
import Vue from 'vue'
export default {
    components:{
        FormPublications
    },
    data() {
        return {
            dataBackgroundColor: 'green',
        }
    },
    methods: {
        createPublication(form){
            const newPublication = new PublicationsClass
            newPublication.callMethod('createPublications', form, (err, result) => {
                if(err){
                    alert(JSON.stringify(err))
                }else{
                    Vue.swal({
                        position: 'top-end',
                        icon: 'success',
                        title: 'Creado Correctamente',
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