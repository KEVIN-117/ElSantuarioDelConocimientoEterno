<script setup lang="ts">
const { event, text } = defineProps({
  event: {
    type: Function,
    required: true
  },
  text: String
})
</script>

<template>
  <button
    class="text-center bg-slate-700 py-2 px-3 rounded-2xl hover:bg-slate-600"
    @click="
      {
        event
      }
    "
  >
    {{ text }}
  </button>
</template>

<style scoped></style>
