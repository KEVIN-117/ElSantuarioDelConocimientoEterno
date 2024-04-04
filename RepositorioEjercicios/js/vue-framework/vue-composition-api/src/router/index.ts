import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/counter',
      name: 'counter',
      component: ()=> import('../views/CounterView.vue')
    },
    {
      path: '/:pathMatch(.*)*',
      name: 'not-found',
      component: ()=> import('../views/NotFoundView.vue')
    },
    {
      path: '/formValidation',
      name: 'form-validation',
      component: ()=> import('../views/FormValidationView.vue')
    }
  ]
})

export default router
