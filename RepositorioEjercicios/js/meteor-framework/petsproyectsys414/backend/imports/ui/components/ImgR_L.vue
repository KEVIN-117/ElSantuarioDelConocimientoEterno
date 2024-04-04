<template>
    <div v-if="lefth" >
        <div class="row mt-5 mb-5" >
            <div class="col-md-6 d-flex justify-content-center align-items-center background-grid">
                <div class="set-my-border-radius bg-img2">
                    <img class="set-my-border-radius card-img" :src="img" alt="">
                </div>
            </div>
            <div class=" col-md-6">
                <div class="mt-5 nb-5">
                    <h5 class="text-center display-4 set-my-text">
                        {{title}}
                    </h5>
                </div>
                <div class="mt-5 d-flex flex-column justify-content-center align-items-center">
                      <div>
                          <p class=" col-md-12 text-justify" style="bottom: 0; ">
                            {{description}}
                          </p>
                      </div>
                      <div>
                        <Button class="pt-4" :desing="'d1'" :title="'LEARN MORE'"/>
                      </div>
                </div>
            </div>
        </div>
    </div>
    <div v-else class="cards-L-R">
        <div class="row">
            <div class="col-md-12 mt-5">
                <h5 class="card-title display-4 set-my-bg my-font-weight set-my-text" >{{title}}</h5>
            </div>
            <div class="col-md-12" v-for="item in items" v-bind:key="item">
                <h4 class="mt-5 mb-3 set-my-text-two card-subtitle text-muted h3 set-my-bg-primary my-border" >
                  {{item.header}}
                </h4>
                <p class="set-my-text-two card-text set-my-bg-primary">
                  {{item.message}}
                </p>
            </div>
        </div>
    </div>
</template>
<script>
import Titles from './TitleContent.vue'
import Button from './Button.vue'
    export default {
        components: {
            Button,
            Titles,
        },
        props:{
            lefth:Boolean,
            img:String,
            title:String,
            subTitle:String,
            description:String,
        },
        data() {
          return {
            items: [
              { 
                header:'LOREM IPSUM DOLOR SIT',
                message: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.p', 
              }, 
              { 
                header:'LOREM IPSUM DOLOR SIT',
                message: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.',
              },
              {
                header:'LOREM IPSUM DOLOR SIT',
                message: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.ni',
              },
            ]
          }
        }
    }
</script>
<style scoped src="../../assets/css/principal.css">
     :root{
        --my-bg-img-R: #bb413e;
    }
  .background-grid{
    background: url('/images/Grid-01.svg') !important;
    background-position: center !important;
    background-repeat: no-repeat !important;
  }
  .background-grid2{
    background: url('/images/Grid2.png') !important;
    background-position: center !important;
    background-repeat: no-repeat !important;
  }
  .set-my-bg-Img-R{
    background: var(--my-bg-img-R);
  }

  .my-border{
    border-bottom: 1px solid var(--my-bg-white) !important;
  }
  .my-font-weight{
    font-weight: 600;
  }
  .set-my-border-radius{
    border-radius: 20px !important;
  } 
</style>