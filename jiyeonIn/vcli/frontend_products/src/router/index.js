import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '@/views/HomeView.vue'

import ProductListPage from '@/views/product/ProductListPage.vue'
import ProductRegisterPage from '@/views/product/ProductRegisterPage.vue'
import ProductReadPage from '@/views/product/ProductReadPage.vue'
import ProductModifyPage from '@/views/product/ProductModifyPage.vue'

import EventBusTestPage from '@/views/eventbus/EventBusTestPage.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomeView',
    component: HomeView
  },
  {
    path: '/productList',
    name: 'ProductListPage',
    component: ProductListPage
  },
  {
    path: '/productRegister',
    name: 'ProductRegisterPage',
    component: ProductRegisterPage
  },
  {
    path: '/productRead/:board_no',
    name: 'ProductReadPage',
    components: {
      default: ProductReadPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/eventbusTest',
    name: 'EventBusTestPage',
    component: EventBusTestPage
  },
  {
    path: '/productModify/:board_no',
    name: 'ProductModifyPage',
    components: {
      default: ProductModifyPage
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
