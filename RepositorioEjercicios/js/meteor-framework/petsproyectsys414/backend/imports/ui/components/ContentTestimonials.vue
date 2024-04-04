<template>
    <div>
        <div class="mt-3 mb-3 row card-body set-my-text-two text-justify">
            <div class="col-md-12">
                <h5 class="card-title">{{testimony}}</h5>
            </div>
            <div class="col-md-12">
                <h6 class="card-subtitle  text-muted">{{author}}</h6>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    props:{
        testimony:String,
        author:String,
    }
}
</script>
<style scoped src="../../assets/css/principal.css">
    /* .set-trasparent{
        background-color: transparent !important;
    } */
</style>