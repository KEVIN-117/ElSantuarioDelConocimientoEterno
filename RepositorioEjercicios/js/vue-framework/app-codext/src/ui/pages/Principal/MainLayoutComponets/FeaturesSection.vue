<template>
    <div>
        <section class="set-my-bg-poligon set-my-heigth pt-5 pb-5 set-my-bg-one">
          <div class="container-fluid">
            <div class="d-flex flex-column justify-content-center aling-items-center">
              <div class="text-center set-my-font-family-one fw-semibold display-5 m-5">
                    web Provides best Feature <br>for customer
              </div>
              <div >
                <div class="p-5 row gap-4 justify-content-center">
                  <div class="col-md-3 row justify-content-center">
                    <FeaturesCard 
                      :icon="'fa-solid fa-code fa-beat'" 
                      :iconColor="'#fb8484'" 
                      :titleCard="'Clean Code'" 
                      :subtitle="'Lorem ipsum dolor sit, amet consectetur adipisicing elit.'" 
                      :GradientEffect="'0 0 10px 10px #fb8484, 0 0 20px 20px #fea2bb, 0 0 30px 30px #f8c3e2, 0 0 35px 35px #f4e3f8, 0 0 40px 40px #ffffff'"
                    />
                  </div>
                  <div class="col-md-3 row justify-content-center">
                    <FeaturesCard 
                      :icon="'fa-solid fa-chart-column fa-flip'" 
                      :iconColor="'#f8c986'" 
                      :titleCard="'Data Analytic'" 
                      :subtitle="'Lorem ipsum dolor sit, amet consectetur adipisicing elit.'" 
                      :GradientEffect="'0 0 10px 10px #f8c986, 0 0 20px 20px #ffccb6, 0 0 30px 30px #ffdae3, 0 0 35px 35px #ffeefd, 0 0 40px 40px #ffffff'"
                    />
                  </div>
                  <div class="col-md-3 row justify-content-center">
                    <FeaturesCard 
                      :icon="'fa-solid fa-file-shield fa-beat'" 
                      :iconColor="'#86efe8'" 
                      :titleCard="'Fully Secured'" 
                      :subtitle="'Lorem ipsum dolor sit, amet consectetur adipisicing elit.'" 
                      :IconBtn="'fa-solid fa-arrow-right fa-bounce'"
                      :GradientEffect="'0 0 10px 10px #86efe8, 0 0 20px 20px #a6f2ff, 0 0 30px 30px #cff4ff, 0 0 35px 35px #eff7ff, 0 0 40px 40px #ffffff'"
                      />
                  </div>
                  <div class="col-md-3 row justify-content-center">
                    <FeaturesCard 
                      :icon="'fa-solid fa-envelope-circle-check fa-flip'" 
                      :iconColor="'#e56af8'" 
                      :titleCard="'24/7 Support'" 
                      :subtitle="'Lorem ipsum dolor sit, amet consectetur adipisicing elit.'" 
                      :GradientEffect="'0 0 10px 10px #e56af8, 0 0 20px 20px #e198ff, 0 0 30px 30px #e3beff, 0 0 35px 35px #ece0ff, 0 0 40px 40px #ffffff'"
                      />
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
    </div>
</template>
<script>
import FeaturesCard from '../../../../components/FeaturesCard.vue'
export default {
    name:'FeaturesSection',
    components:{
        FeaturesCard,
    }
}
</script>
<style >
    
</style>