<template >
  <div class="content">
    <div class="md-layout">
      <div class="md-layout-item md-medium-size-100 md-size-100">
        <FormFoot :methodCreateOrEdit="addFoot"/>
      </div>
    </div>
  </div>
</template>
<script>
import {FoodClass} from '../../../../../api/models/food/class'
import FormFoot from './FormFoot.vue'
import Vue from 'vue'
export default {
    components:{
        FormFoot
    },
    data() {
        return {
            dataBackgroundColor: 'green',
            show: true
        }
    },
    methods: {
        addFoot(form){
            const newFoot= new FoodClass
            newFoot.callMethod('addFoots', form, (err, result) => {
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