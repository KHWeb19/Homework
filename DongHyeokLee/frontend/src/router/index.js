import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

import ConcaveGame from '@/views/game/ConcaveGame.vue'

import ProductListPage from '@/views/product/ProductListPage.vue'
import ProductRegisterPage from '@/views/product/ProductRegisterPage.vue'
import ProductReadPage from '@/views/product/ProductReadPage.vue'
import ProductModifyPage from '@/views/product/ProductModifyPage.vue'

import CoverFlowTestPage from '@/views/ui/CoverFlowTestPage.vue'

import VuetifyTest from '@/views/ui/VuetifyTest.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: HomeView
  },
  {
    path: '/coverFlowTest',
    name: 'CoverFlowTestPage',
    component: CoverFlowTestPage
  },
  {
    path: '/ui/vutifytest',
    name: 'VuetifyTest',
    component: VuetifyTest
  },
  {
    path: '/game/concave',
    name: 'Concave',
    component: ConcaveGame
  },
  {
    path: '/productRead/:boardNo',
    name: 'ProductReadPage',
    components: {
      default: ProductReadPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/productModify/:boardNo',
    name: 'ProductModifyPage',
    components: {
      default: ProductModifyPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/productRegister',
    name: 'ProductRegisterPage',
    component: ProductRegisterPage
  },
  {
    path: '/productList',
    name: 'ProductListPage',
    component: ProductListPage
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
