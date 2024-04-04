<template>
    <div v-if="pading" class="mb-5 d-flex justify-content-center align-items-center" :style="{fontWeight: fontWeight}">
        <div class="titles p-2 bd-highlight set-my-text text-uppercase" :style="{fontSize: fontSize + 'em'}">{{content}}</div>
    </div>
    <div v-else class="d-flex mb-3" :style="{fontWeight: fontWeight}">
        <div class="titles bd-highlight set-my-text text-uppercase" :style="{fontSize: fontSize + 'em'}">{{content}}</div>
    </div>
</template>
<script>
export default {
    props:{
        fontSize:Number,
        fontWeight:Number,
        content:String,
        pading: Boolean,

    }
}
</script>
<style scoped src="../../assets/css/principal.css">
    
</style>