<template>
    <div>
        <div class="set-glass-efect  row justify-content-center mb-4 p-2 set-my-font-family-two">
            <div v-if="MyScreen" class="fs-1 col-md-1 me-1 fw-bold" :style="{color:color}">
                <div>
                    <ion-icon name="arrow-redo-outline"></ion-icon>
                </div>
            </div>
            <div class="col-md-10">
                <div class="fs-2 fw-semibold set-my-font-family-one">{{title}}</div>
                <div>{{ subTitle }}</div>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        props:{
            color:String,
            title:String,
            subTitle:String
        },
        data() {
            return {
                MyScreen:Boolean
            }
        },
        methods: {
            setScreen(){
                if(screen.width > 767){
                    this.MyScreen = true;
                }else{
                    this.MyScreen = false;
                }
            }
        },
        created() {
            window.setInterval(this.setScreen ,100)
        },
        
    }
</script>
<style>
</style>