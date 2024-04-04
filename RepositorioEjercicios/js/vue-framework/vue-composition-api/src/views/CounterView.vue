<script setup lang="ts">
import gsap from 'gsap'
import { useCounterStore } from '../stores/counter'
const counterStore = useCounterStore()
function onBeforeEnter(el) {
  gsap.set(el, {
    scaleX: 0.25,
    scaleY: 0.25,
    opacity: 1
  })
}

function onEnter(el, done) {
  gsap.to(el, {
    duration: 1,
    scaleX: 1,
    scaleY: 1,
    opacity: 1,
    ease: 'elastic.inOut(2.5, 1)',
    onComplete: done
  })
}

function onLeave(el, done) {
  gsap.to(el, {
    duration: 0.7,
    scaleX: 1,
    scaleY: 1,
    x: 300,
    ease: 'elastic.inOut(2.5, 1)'
  })
  gsap.to(el, {
    duration: 0.2,
    delay: 0.5,
    opacity: 0,
    onComplete: done
  })
}
</script>

<template>
  <div class="flex flex-col gap-1.5 justify-center items-center">
    <div class="flex flex-1 gap-2">
      <button
        class="text-center bg-slate-700 py-2 px-3 rounded-2xl hover:bg-slate-600"
        @click="counterStore.increment"
      >
        Increment
      </button>
      <button
        class="text-center bg-slate-700 py-2 px-3 rounded-2xl hover:bg-slate-600"
        @click="counterStore.decrement"
      >
        Decrement
      </button>
    </div>
    <Transition
        @before-enter="onBeforeEnter"
        @enter="onEnter"
        @leave="onLeave"
        name="slide-up"
    >
      <h2 v-if="counterStore.docState"  class=" text-9xl text-emerald-600" >{{ counterStore.count }}</h2>
    </Transition>
  </div>
</template>

<style scoped>
button {
  border: none;
  outline: none;
}
.slide-up-enter-active,
.slide-up-leave-active {
  transition: all 0.25s ease-out;
}

.slide-up-enter-from {
  opacity: 0;
  transform: translateY(30px);
}

.slide-up-leave-to {
  opacity: 0;
  transform: translateY(-30px);
}
</style>
