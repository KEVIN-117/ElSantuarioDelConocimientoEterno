<template>
    <div class="bg-gradient-effect-border set-glass-efect p-0 overflow-hidden">
        <div class="card-bg">
            <div class="w-100 p-2  d-flex justify-content-center aling-items-center" >
                <div class="p-5 m-2 rounded-circle  fs-1 text-center set-my-font-family-one" :style="{ background: iconColor}">
                    <i :class="icon" style="--fa-animation-duration: 3s;"></i>
                </div>
            </div>
            <div class="col-md-12 pt-5 set-clip-path">
                <div class="pt-5 row">
                    <p class="col-md-12 fs-3 text-center fw-semibold set-my-font-family-two">{{ titleCard }}</p>
                    <p class="col-md-12 text-center set-my-font-family-one mb-3">{{ subtitle }}</p>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    props:{
        icon:String,
        iconColor: String,
        titleCard:String,
        subtitle:String,
        GradientEffect:String,
        insetGradientEffect:String,
    },
    data() {
        return {
            
        }
    },
}
</script>
<style scoped>
    .bg-gradient-effect-border:hover .set-clip-path{
        background: v-bind(iconColor) ;
        clip-path: polygon(100% 100%, 0% 100% , 0.00% 20.22%, 1.00% 20.32%, 2.00% 20.39%, 3.00% 20.40%, 4.00% 20.36%, 5.00% 20.28%, 6.00% 20.15%, 7.00% 19.98%, 8.00% 19.76%, 9.00% 19.50%, 10.00% 19.20%, 11.00% 18.86%, 12.00% 18.49%, 13.00% 18.08%, 14.00% 17.65%, 15.00% 17.20%, 16.00% 16.72%, 17.00% 16.23%, 18.00% 15.73%, 19.00% 15.23%, 20.00% 14.72%, 21.00% 14.21%, 22.00% 13.71%, 23.00% 13.22%, 24.00% 12.75%, 25.00% 12.30%, 26.00% 11.87%, 27.00% 11.47%, 28.00% 11.10%, 29.00% 10.77%, 30.00% 10.47%, 31.00% 10.21%, 32.00% 10.00%, 33.00% 9.83%, 34.00% 9.71%, 35.00% 9.63%, 36.00% 9.60%, 37.00% 9.62%, 38.00% 9.69%, 39.00% 9.80%, 40.00% 9.96%, 41.00% 10.16%, 42.00% 10.41%, 43.00% 10.70%, 44.00% 11.03%, 45.00% 11.39%, 46.00% 11.78%, 47.00% 12.20%, 48.00% 12.65%, 49.00% 13.12%, 50.00% 13.60%, 51.00% 14.10%, 52.00% 14.60%, 53.00% 15.11%, 54.00% 15.62%, 55.00% 16.12%, 56.00% 16.61%, 57.00% 17.09%, 58.00% 17.55%, 59.00% 17.99%, 60.00% 18.40%, 61.00% 18.78%, 62.00% 19.12%, 63.00% 19.43%, 64.00% 19.70%, 65.00% 19.93%, 66.00% 20.12%, 67.00% 20.26%, 68.00% 20.35%, 69.00% 20.40%, 70.00% 20.39%, 71.00% 20.34%, 72.00% 20.24%, 73.00% 20.10%, 74.00% 19.91%, 75.00% 19.68%, 76.00% 19.40%, 77.00% 19.09%, 78.00% 18.74%, 79.00% 18.35%, 80.00% 17.94%, 81.00% 17.50%, 82.00% 17.04%, 83.00% 16.56%, 84.00% 16.07%, 85.00% 15.56%, 86.00% 15.06%, 87.00% 14.55%, 88.00% 14.04%, 89.00% 13.55%, 90.00% 13.06%, 91.00% 12.60%, 92.00% 12.15%, 93.00% 11.74%, 94.00% 11.34%, 95.00% 10.99%, 96.00% 10.66%, 97.00% 10.38%, 98.00% 10.14%, 99.00% 9.94%, 100.00% 9.78%);
        
    }
    .border-btn{        
        border: 2px white solid;
    }
    .card-bg:hover{
        background: #ffffff;
        box-shadow: inset   v-bind(GradientEffect);
    }
    
    .bg-gradient-effect-border:hover{
        border: 4px white solid;
        box-shadow: v-bind(GradientEffect);
        
    }
    .bg-gradient-effect-border:hover .card-bg{
        box-shadow: inset  v-bind(GradientEffect);
        transition: 2s cubic-bezier(0.175, 0.885, 0.32, 1.275);
    }
</style>
