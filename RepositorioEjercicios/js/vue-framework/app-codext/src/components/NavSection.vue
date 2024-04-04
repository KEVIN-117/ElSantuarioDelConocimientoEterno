<template>
  <div>
      <div class="mt-5 mb-5">
        <div class="row gap-5">
            <div class="col-md-6 row gap-3 justify-content-center set-my-font-family-two">
              <div class="col-md-12 fw-semibold display-2 set-my-color-text-background">Codext one of the best system in SAAS.</div>
              <div class="col-md-10 text-center set-my-color-text-background">Lorem ipsum dolor sit amet consectetur adipisicing elit. Sed doloribus error a ea deserunt vero magnam, doloremque eveniet voluptatum.</div>
              <div class="col-md-12">
                  <ButtonVue :title="'try a live demo'" :state="2" :buttonBg="'#00a9ff'"/>
              </div>
            </div>
            <div class="col-md-6 row justify-content-center aling-items-center">
              <div class="col-md-12">
                <img class="img-fluid" src="../assets/img/main-image2.svg" alt="">
              </div>
            </div>
        </div>
      </div>
  </div>
</template>

<script>
import ButtonVue from './ButtonVue.vue'
export default {
    components:{
      ButtonVue
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
