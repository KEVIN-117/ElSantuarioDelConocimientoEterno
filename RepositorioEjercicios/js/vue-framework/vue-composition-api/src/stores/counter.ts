import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useCounterStore = defineStore('counter', () => {
  const count = ref(0)
  const docState = ref(true)
  const nextCount = computed(() => count.value + 1)
  const prevCount = computed(() => count.value - 1)
  function increment() {
    setInterval(() => {
        docState.value = true
    }, 1500)
    docState.value = false
    count.value += 1
  }
  function decrement() {
    setInterval(() => {
      docState.value = true
    }, 1000)
    docState.value = false
    if (count.value > 0) count.value -= 1
  }

  return { count, nextCount, prevCount, docState, decrement, increment }
})
