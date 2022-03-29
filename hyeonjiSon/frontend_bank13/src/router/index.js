import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home.vue'

import MarketListPage from '@/views/market/MarketListPage.vue'
import MarketRegisterPage from '@/views/market/MarketRegisterPage.vue'
import MarketReadPage from '@/views/market/MarketReadPage.vue'

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
  },
  {
    path: '/marketRead/:productNo',
    name: 'MarketReadPage',
    components: {
      default: MarketReadPage
    },
    props: {
      default: true
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
