import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import TestView from "@/views/TestView";
import ProductListPage from "@/views/product/ProductListPage";
import ProductRegisterPage from "@/views/product/ProductRegisterPage";
import ProductReadPage from "@/views/product/ProductReadPage";
import ProductModifyPage from "@/views/product/ProductModifyPage";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/testView',
    name: 'TestView',
    component: TestView
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
    path: '/productRead/:productNo',
    name: 'ProductReadPage',
    components: { // 이건 뭐지? 이거 없으면 안됨.
      default: ProductReadPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/productModify/:productNo',
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
