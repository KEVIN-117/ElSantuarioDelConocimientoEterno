<template>
    <div>
        <div class="set-my-bg-circles pt-5 pb-5 set-my-bg-one">
            <div class="container">
              <div class="row justify-content-center">
                <div class="col-md-6 d-flex flex-column justify-content-center aling-items-center">
                    <div class="set-glass-efect rounded-circle">
                      <img class="img-fluid" src="../../../../assets/img/Image2.svg" alt="">
                    </div>
                </div>
                <div class="col-md-6 row">
                  <div class="col-md-12 text-center set-my-font-family-two fw-semibold display-5">
                    It's helpful for operating system
                  </div>
                  <div class="col-md-12 row justify-content-center mt-5">
                    <div>
                      <OperatingSystem :color="'#ef821e'" :title="'Ultra fast & Secure'" :subTitle="'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Dolore fuga odio eos blanditiis laborum alias labore'"/>
                      <OperatingSystem :color="'#5ebd14'" :title="'Ultra fast & Secure'" :subTitle="'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Dolore fuga odio eos blanditiis laborum alias labore'"/>
                      <OperatingSystem :color="'#3b87fa'" :title="'Ultra fast & Secure'" :subTitle="'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Dolore fuga odio eos blanditiis laborum alias labore'"/>
                    </div>
                  </div>
                </div>
              </div>
            </div>
        </div>
    </div>
</template>
<script>
import OperatingSystem from '../../../../components/OperatingSystem.vue'
export default {
    name: 'OsSection',
    components:{
        OperatingSystem,
    }
}
</script>
<style>
    
</style>