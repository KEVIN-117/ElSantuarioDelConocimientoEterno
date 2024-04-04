<template>
    <div class="set-my-text set-bg col-md-5 mt-5 mb-5 p-4">
      <div>
        <div class="title-form">
          Contact me
        </div>
        <b-form class="contentForm" @submit="onSubmit" @reset="onReset" v-if="show">
          <b-form-group id="input-group-1" label="Email:" label-for="input-1">
            <b-form-input class="my-form-control" id="input-1" v-model="form.email" type="email" placeholder="Tu email" required ></b-form-input>
          </b-form-group>
    
          <b-form-group id="input-group-2" label="Nombre:" label-for="input-2">
            <b-form-input class="my-form-control"  id="input-2" v-model="form.name" placeholder="Tu nombre" required ></b-form-input>
          </b-form-group>
    
          <b-form-group id="input-group-3" label="Servicio que requiere:" label-for="input-3">
            <b-form-select
              class="my-form-control" 
              id="input-3"
              v-model="form.food"
              :options="foods"
              required
            ></b-form-select>
          </b-form-group>
    
          <b-form-group id="input-group-4" v-slot="{ ariaDescribedby }">
            <b-form-checkbox-group
              class="my-form-control" 
              v-model="form.checked"
              id="checkboxes-4" 
              :aria-describedby="ariaDescribedby"
            >
            </b-form-checkbox-group>
          </b-form-group>

          <b-form-group id="input-group-5" label="Mensaje">
              <b-form-textarea
                  class="my-form-control" 
                  id="textarea-small"
                  rows="5"
                  placeholder="Small textarea"
                  v-model="form.message"
              ></b-form-textarea>
          </b-form-group>
          <div class="d-flex align-items-center justify-content-center">
              <div><Button class="button" :title="'Enviar'" :desing="'d3'"/></div>
          </div>
        </b-form>
        <!-- <b-card class="mt-3" header="Form Data Result">
          <pre class="m-0">{{ form }}</pre>
        </b-card> -->
      </div>
    </div>
</template>
<script>
import Button from '../components/Button.vue'
  export default {
    components:{
      Button,
    },
    data() {
      return {
        form: {
          email: '',
          name: '',
          food: null,
          message:'',
        },
          foods: [{ text: 'elegir servicios ', value: null }, 'Aseo', 'Hotel de mascotas', 'Salon de mascotas', 'Paquete Completo'],
          show: true
        }
      },
      methods: {
        onSubmit(event) {
          event.preventDefault()
          console.log(JSON.stringify(this.form))
        },
        onReset(event) {
          event.preventDefault()
          // Reset our form values
          this.form.email = ''
          this.form.name = ''
          this.form.food = null
          this.form.message = ' '
          // Trick to reset/clear native browser form validation state
          this.show = false
          this.$nextTick(() => {
            this.show = true
          })
        }
      }
    }
</script>
<style scoped src="../../assets/css/principal.css">
  /* .title-form{
    font-size: 2em !important; 
    font-weight: 600 !important;
    text-align: center;
    text-transform: uppercase;
  }
  .set-bg{
    border-radius: 20px !important;
    background: #e5ddd1 !important;
  }


  .my-form-control {
    background: transparent !important;
    border-left: none !important;
    border-right: none !important;
    border-top: none !important;
    border-radius: none !important;
    border-bottom: 2px solid var(--my-bg-primary-color) !important;
    opacity: 0.5;
  }

  .my-form-control:focus{
    background: transparent !important;
    border-left: none !important;
    border-right: none !important;
    border-top: none !important;
    border-bottom: 2px solid var(--my-bg-primary-color) !important;
    box-shadow: none;
    color: black !important;
    
  }
  .custom-select{
    background: transparent !important;
    border-left: none !important;
    border-right: none !important;
    border-top: none !important;
    border-bottom: 2px solid var(--my-bg-primary-color) !important;
    opacity: 0.5;
  }

  .custom-select:focus{
    background: transparent !important;
    border-left: none !important;
    border-right: none !important;
    border-top: none !important;
    border-bottom: 2px solid var(--my-bg-primary-color) !important;
    box-shadow: none;
    color: black !important;
  }

  .button{
    border-radius: 100px !important;
    background-image: linear-gradient(to right top, #ede6e1, #e5ddd1, #d8d4c2, #c6cdb5, #b1c7ad, #a5c6b0, #99c5b4, #8dc3ba, #8ec7c6, #91c9d1, #98ccdb, #a1cee4);
    box-shadow: 0 0 10px var(--my-bg-primary-color);
    font-size: 1.5em;
    text-transform: uppercase;
    font-weight: 900;
    letter-spacing: 5px;
  }
  .button:active{
    border-radius: 100px !important;
    background-image: linear-gradient(to left bottom, #ede6e1, #e5ddd1, #d8d4c2, #c6cdb5, #b1c7ad, #a5c6b0, #99c5b4, #8dc3ba, #8ec7c6, #91c9d1, #98ccdb, #a1cee4);
    
  } */
</style>