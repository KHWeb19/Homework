import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home.vue'

import MarketListPage from '@/views/market/MarketListPage.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/marketList',
    name: 'MarketListPage',
    component: MarketListPage
  },
  {
    path: '/marketRegister',
    name: 'MarketRegisterPage',
    component: MarketRegisterPage
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
