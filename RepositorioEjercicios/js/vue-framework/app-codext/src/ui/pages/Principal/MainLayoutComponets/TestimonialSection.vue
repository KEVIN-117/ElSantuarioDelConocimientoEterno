<template>
    <div>
        <div class="set-my-heigth">
            <div class="container mt-4 mb-5">
                <div class="row justify-content-center gap-5">
                    <div class="col-md-10">
                        <h1 class="text-center set-my-font-family-two fs-1 fw-semibold">Lets's see our Users Review</h1>
                        <p class="text-center">Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti tempora, autem nemo ducimus exercitationem officiis excepturi amet ex iure corporis quasi. Numquam ratione debitis placeat, molestias laboriosam sed earum quibusdam.</p>
                    </div>
                    <div class="col-md-10">
                        <WorkerTestimonials
                            :img="'./Avatar/yoututosjefew.jpg'"
                            :testimonial="'Tailwind CSS is the only framework that Ive seen scale on large teams. Its easy to customize, adapts to any design, and the build size is tiny.'"
                            :author="'Sarah Dayan'"
                            :job="'Staff Engineer, Algolia'"
                        />
                    </div>
                    <div class="col-md-10">
                        <WorkerTestimonials
                            :img="'./Avatar/dune.jpg'"
                            :testimonial="'Tailwind CSS is the only framework that Ive seen scale on large teams. Its easy to customize, adapts to any design, and the build size is tiny.'"
                            :author="'Wilson Bergson'"
                            :job="'Full Stack Develper'"
                        />
                    </div>
                    <div class="col-md-10">
                        <WorkerTestimonials
                            :img="'./Avatar/yoututosjefffqwr2213.jpg'"
                            :testimonial="'Tailwind CSS is the only framework that Ive seen scale on large teams. Its easy to customize, adapts to any design, and the build size is tiny.'"
                            :author="'Maya Press'"
                            :job="'Marketing Manager'"
                        />
                    </div>
                </div>
            </div>
        </div>  
    </div>
</template>

<script>
import WorkerTestimonials from '../../../../components/WorkerTestimonials.vue'
export default {
    name:'TestimonialSection',
    components:{
        WorkerTestimonials
    }
}
</script>
<style>
    
</style>