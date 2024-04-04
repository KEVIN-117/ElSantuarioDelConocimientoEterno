<template>
    <div>
        <div class="card bg-gradient-effect-border mt-3 mb-3">
            <img :src="img" class="card-img-top" alt="...">
            <ul class="d-flex mt-3 justify-content-center gap-4 set-my-font-family-two text-sky-500">
                <li class="list-group-item liBg">{{ teamType }}</li>
                <li class="list-group-item liBg">{{ date }}</li>
                <li class="list-group-item liBg">{{ author }}</li>
            </ul>
            <div class="card-body set-my-font-family-one">
                <h5 class="card-title fw-bolder" >{{ title }}</h5>
                <p class="card-text fst-italic">{{ body }}</p>
                <a>
                    <BTN :title="'continue'" :state="1" :buttonBg="'#00a9ff'"/>
                </a>
            </div>
        </div>
    </div>
</template>
<script>
import BTN from './ButtonVue.vue'
export default {
    components:{
        BTN,
    },
    props:{
        img: String,
        teamType: String,
        date: String,
        author:String,
        title: String,
        body: String,
    }
}
</script>
<style scoped>
    .bg-gradient-effect-border{
        transition: 2s;
    }
    .liBg{
        background-color: var(--my-button-bg);
        font-weight: bolder !important;
        border: 2px solid var(--my-button-bg) !important;
        color: white;
        display: flex;
        justify-content: center;
        align-items: center;
        border-radius: 5px;
    }
    .bg-gradient-effect-border:hover{
        transition: 1s;
        overflow: hidden;
        border-radius: 20px;
        background: rgba( 255, 255, 255, 0.05 );
        box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 ), 0 32px 32px 0 rgba(6, 14, 128, 0.37), inset 0 0 20px rgba(6, 14, 128, 0.37);
        backdrop-filter: blur( 14.5px );
        -webkit-backdrop-filter: blur( 14.5px );
        border-radius: 10px;
    }
</style>