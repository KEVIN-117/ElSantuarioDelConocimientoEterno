<template>
    <div>
        <figure class="row md_flex bg-slate-100 rounded-xl p-8 m-2  dark_bg-slate-100 bg-gradient-effect-border">
            <img class="col-md-4 img-rounded-xl rounded-full mx-auto" :src="img" alt="cffewfwefewrfew" >
            <div class="col-md-8 pt-6 md_p-8 text-center md_text-left space-y-4">
                    <blockquote>
                        <p class="text-lg font-medium set-my-font-family-two fs-4">
                            “{{ testimonial }}”
                        </p>
                    </blockquote>
                    <figcaption class="font-medium">
                    <div class="text-sky-500 set-my-font-family-one">
                        <!-- Sarah Dayan -->
                        {{ author }}
                    </div>
                    <div class="text-slate-700 set-my-font-family-two">
                        <!-- Staff Engineer, Algolia -->
                        {{ job }}
                    </div>
                </figcaption>
            </div>
        </figure>
    </div>
</template>
<script>

    export default {
        props:{
            img:String,
            testimonial:String,
            author:String,
            job:String,
        },
        
    }
</script>
<style scoped>

    .bg-gradient-effect-border:hover{
        transform: scaleY(1.1);
        transition: 2s cubic-bezier(0.215, 0.610, 0.355, 1);
        overflow: hidden;
        border-radius: 20px;
        background: rgba( 255, 255, 255, 0.05 );
        box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 ), 0 32px 32px 0 rgba(6, 14, 128, 0.37), inset 0 0 20px rgba(6, 14, 128, 0.37);
        backdrop-filter: blur( 14.5px );
        -webkit-backdrop-filter: blur( 14.5px );
        border-radius: 10px;
    }
    .bg-gradient-effect-border:hover img, .bg-gradient-effect-border:hover div{
        transform: translate(20);
    }

    .rounded-xl{
        border-radius: 1.75rem;
    }
    
    .bg-slate-100 {
        background: #f1f5f9;
    }

    .pt-6{
        padding-top: 1.5rem;
    }
    .p-8{
        padding: 2rem;
    }
    .mx-auto{
        margin-left: auto;
    }
    .space-y-4{
        margin-top: 1rem;
    }
    .text-lg{
        font-size: 1.125rem; /* 18px */
        line-height: 1.75rem;
    }
    .font-medium{
        font-weight: 500;
    }


    .text-slate-700{
        color: rgb(51 65 85);
    }
    .img-rounded-xl{
        border-radius: 10%;
    }
    @media (min-width: 768px) { 
        .md_flex{
            display: flex;
        }

        .md_p-8{
            padding: 2rem;
        }
        .md_text-left{
            text-align: left;
        }

    }
    
</style>