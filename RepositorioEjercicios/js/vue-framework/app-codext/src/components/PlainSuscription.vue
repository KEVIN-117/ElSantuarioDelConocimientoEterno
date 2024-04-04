<template>
    <div class="bg-gradient-effect-border set-glass-efect overflow-hidden">
        <div class="card-bg set-bg-card">
            <div class="row justify-content-center set-my-font-family-two aling-items-center" >
                <div class="col-md-12 fs-3 text-center m-2 fw-semibold set-color-text">{{ typeSuscription }}</div>
                <div class="col-md-12 fs-1 text-center m-2 fw-bolder set-color-text">${{ pricing }}<sub>/mo</sub> </div>
            </div>
            <div class="col-md-12 pt-5 text-center set-clip-path">
                <div class="pt-5 d-flex flex-column set-my-font-family-one">
                    <p>Easy Customisable</p>
                    <p>Comercial licence</p>
                    <p>{{ amountUser }} user licence</p>
                    <div class="m-4">
                        <ButtonVue :title="'try this package'" :state="1" :buttonBg="'#00a9ff'"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import ButtonVue from './ButtonVue.vue';
export default {
    components:{
        ButtonVue
    },
    props:{
        icon:String,
        iconColor: String,
        typeSuscription:String,
        pricing:Number,
        amountUser:Number,
        clipPathBg:String,
    },
    data() {
        return {
            
        }
    },
}
</script>
<style scoped>
    .set-clip-path{
        height: 100%;
        background: white !important;
        clip-path: polygon(100% 100%, 0% 100% , 0.00% 20.22%, 1.00% 20.32%, 2.00% 20.39%, 3.00% 20.40%, 4.00% 20.36%, 5.00% 20.28%, 6.00% 20.15%, 7.00% 19.98%, 8.00% 19.76%, 9.00% 19.50%, 10.00% 19.20%, 11.00% 18.86%, 12.00% 18.49%, 13.00% 18.08%, 14.00% 17.65%, 15.00% 17.20%, 16.00% 16.72%, 17.00% 16.23%, 18.00% 15.73%, 19.00% 15.23%, 20.00% 14.72%, 21.00% 14.21%, 22.00% 13.71%, 23.00% 13.22%, 24.00% 12.75%, 25.00% 12.30%, 26.00% 11.87%, 27.00% 11.47%, 28.00% 11.10%, 29.00% 10.77%, 30.00% 10.47%, 31.00% 10.21%, 32.00% 10.00%, 33.00% 9.83%, 34.00% 9.71%, 35.00% 9.63%, 36.00% 9.60%, 37.00% 9.62%, 38.00% 9.69%, 39.00% 9.80%, 40.00% 9.96%, 41.00% 10.16%, 42.00% 10.41%, 43.00% 10.70%, 44.00% 11.03%, 45.00% 11.39%, 46.00% 11.78%, 47.00% 12.20%, 48.00% 12.65%, 49.00% 13.12%, 50.00% 13.60%, 51.00% 14.10%, 52.00% 14.60%, 53.00% 15.11%, 54.00% 15.62%, 55.00% 16.12%, 56.00% 16.61%, 57.00% 17.09%, 58.00% 17.55%, 59.00% 17.99%, 60.00% 18.40%, 61.00% 18.78%, 62.00% 19.12%, 63.00% 19.43%, 64.00% 19.70%, 65.00% 19.93%, 66.00% 20.12%, 67.00% 20.26%, 68.00% 20.35%, 69.00% 20.40%, 70.00% 20.39%, 71.00% 20.34%, 72.00% 20.24%, 73.00% 20.10%, 74.00% 19.91%, 75.00% 19.68%, 76.00% 19.40%, 77.00% 19.09%, 78.00% 18.74%, 79.00% 18.35%, 80.00% 17.94%, 81.00% 17.50%, 82.00% 17.04%, 83.00% 16.56%, 84.00% 16.07%, 85.00% 15.56%, 86.00% 15.06%, 87.00% 14.55%, 88.00% 14.04%, 89.00% 13.55%, 90.00% 13.06%, 91.00% 12.60%, 92.00% 12.15%, 93.00% 11.74%, 94.00% 11.34%, 95.00% 10.99%, 96.00% 10.66%, 97.00% 10.38%, 98.00% 10.14%, 99.00% 9.94%, 100.00% 9.78%);
    }
    .set-bg-card:hover{
        background: v-bind(clipPathBg);
    }
    .set-bg-card:hover .set-color-text{
        color: var(--my-color-text-background) !important;
    }
    .bg-gradient-effect-border{
        transform: scaleY(1) scaleX(1);
        transition: 2s cubic-bezier(0.215, 0.610, 0.355, 1);
        overflow: hidden;
        border-radius: 20px;
    }

    .bg-gradient-effect-border:hover{
        background: linear-gradient(to bottom, #5c13c6, #5c13c6, #5c13c6, #d2c8f7, #ffffff);
        transform: scaleY(1.2) scaleX(1.2);
        z-index: 1100;
        padding-right: 2px;
        padding-left: 2px;
        transition: 2s cubic-bezier(0.215, 0.610, 0.355, 1);
        overflow: hidden;
        border-radius: 20px;
    }

</style>
