<script setup lang="ts">
import {ref} from 'vue'
const name = ref('')
const lastName = ref('')
</script>

<template>
  <div class="grid gap-4">
    <h1 class="text-emerald-600 text-6xl uppercase">Register client</h1>
    <form class="w-80 mx-auto" autocomplete="off">

      <div class="grid gap-2">
        <label for="name">Name</label>
        <input class="outline-0 bg-slate-900 py-4 px-2 rounded-2xl active:bg-slate-600 active:text-emerald-600" placeholder="anonymous" type="text" id="name" v-model="name" required />
        <span class="text-base text-[#D21312] ml-3 opacity-50 animate-bounce" v-if="!name">Name is required</span>
      </div>
      <div class="grid gap-2">
        <label for="lastName">Last Name</label>
        <input class="outline-0 bg-slate-900 py-4 px-2 rounded-2xl active:bg-slate-600 active:text-emerald-600" placeholder="anonymous last" type="text" id="name" v-model="lastName" required />
        <span class="text-base text-[#D21312] ml-3 opacity-50 animate-bounce" v-if="!lastName">last Name is required</span>
      </div>
      <div class="grid gap-3">
        <h2 class="text-emerald-600 text-4xl capitalize">sumary</h2>
        <div class="ml-10">
          <p class="text-emerald-400 text-2xl">Name: <span class="text-emerald-300 opacity-50">{{ name }}</span></p>
          <p class="text-emerald-400 text-2xl">Last Name: <span class="text-emerald-300 opacity-50">{{ lastName }}</span></p>
        </div>
      </div>
    </form>
  </div>
</template>

<style scoped>
input[type="text"]::placeholder {
  color: var(--color-text);
  opacity: 0.5;
  text-transform: capitalize;
}
</style>
