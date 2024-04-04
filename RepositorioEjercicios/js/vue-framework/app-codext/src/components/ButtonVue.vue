<template>
    <div>
        <button v-if="state == 1" class="__nav-item-btn btn text-uppercase fw-semibold set-my-font-family-two">{{ title }}</button>
        <button v-else-if="state == 2" class="__nav-item-btn-two btn text-uppercase fw-semibold set-my-font-family-two">{{ title }}</button>
        <button v-else-if="state == 3" class="__nav-item-btn2 btn text-uppercase fw-semibold set-my-font-family-two" :class="title"></button>
        <button v-else-if="state == 4" class="__nav-item-btn-2 none-border btn  text-uppercase fw-semibold set-my-font-family-two">{{ title }}</button>
        <button v-else-if="state == 5" class="__nav-item-btn col-md-12 pt-2 pb-2 btn text-uppercase fw-semibold set-my-font-family-two">{{ title }}</button>
        <button v-else-if="state == 6" class="__nav-item-btn-2 d-flex justify-content-center align-items-center col-md-12 pt-2 pb-2 btn text-uppercase fw-semibold set-my-font-family-two fs-5"><i :class="icon" class="me-4"></i>{{ title }}</button>
    </div>
</template>
<script>
export default {
    props:{
        title: String,
        state:Number,
        buttonBg:String,
        icon:String
    }
}
</script>
<style scoped>
    .__nav-item-btn{
        border: 2px solid v-bind(buttonBg);
        color: v-bind(buttonBg);
        font-weight: bolder !important;
    }
    .__nav-item-btn:active, .__nav-item-btn:focus{
        background-color: v-bind(buttonBg);
        color: white;
    }

    .__nav-item-btn-two{
        background-color: v-bind(buttonBg);
        font-weight: bolder !important;
        border: 2px solid v-bind(buttonBg) !important;
        color: white;
    }

    .__nav-item-btn-two:active, .__nav-item-btn-two:focus{
        background-color: transparent;
        color: v-bind(buttonBg);
    }
    .__nav-item-btn2{
        color: v-bind(buttonBg);
        font-weight: bolder !important;
    }
    .__nav-item-btn2:active{
        border: none;
    }
    .__nav-item-btn2:active, .__nav-item-btn2:active .__nav-item-btn2:focus, .__nav-item-btn2:focus{
        background-color: v-bind(buttonBg);
        color: white;
    }
    .none-border{
        border: none !important;
        border-radius: 0;
    }
    .__nav-item-btn-2{
        background-color: v-bind(buttonBg);
        font-weight: bolder !important;
        color: white;
    }
</style>