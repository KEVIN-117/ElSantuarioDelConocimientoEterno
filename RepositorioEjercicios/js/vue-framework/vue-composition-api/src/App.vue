<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <article class="">
    <header>
      <div>
        <nav class="text-2xl">
          <RouterLink to="/">Home</RouterLink>
          <RouterLink to="/about">About</RouterLink>
          <RouterLink to="/counter">Counter</RouterLink>
          <RouterLink to="/formValidation">Form Validation</RouterLink>
        </nav>
      </div>
    </header>
    <main class="flex justify-center items-center mt-2">
      <RouterView />
    </main>
  </article>
</template>

<style scoped>
header {
  width: 100%;
  max-height: 100vh;
}

nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
}
a {
  border-radius: 20px;
}
nav a.router-link-exact-active {
  color: var(--color-text);
  background-color: var(--color-border);
}

nav a.router-link-exact-active:hover {
  background-color: var(--color-border);
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}
</style>
