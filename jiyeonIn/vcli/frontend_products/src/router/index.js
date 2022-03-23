import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '@/views/HomeView.vue'

import ProductListPage from '@/views/product/ProductListPage.vue'
import ProductRegisterPage from '@/views/product/ProductRegisterPage.vue'
import ProductReadPage from '@/views/product/ProductReadPage.vue'
import ProductModifyPage from '@/views/product/ProductModifyPage.vue'

import EventBusTestPage from '@/views/eventbus/EventBusTestPage.vue'

import VuetifyAllInOneTestPage from '@/views/ui/VuetifyAllInOneTestPage.vue'
import VuetifyImageTestPage from '@/views/ui/VuetifyImageTestPage.vue'
import CovorFlowTestPage from '@/views/ui/CovorFlowTestPage.vue'
import AwesomeSwiperTestPage from '@/views/ui/AwesomeSwiperTestPage.vue'

import ImageGalleryTestPage from '@/views/ui/ImageGalleryTestPage.vue'
import CalendarTestPage from '@/views/ui/CalendarTestPage.vue'

import VueFileUploadPage from '@/views/fileUpload/VueFileUploadPage.vue'

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
  },
  {
    path: '/vuetifyTest',
    name: 'VuetifyAllInOneTestPage',
    component: VuetifyAllInOneTestPage
  },
  {
    path: '/vuetifyImageTest',
    name: 'VuetifyImageTestPage',
    component: VuetifyImageTestPage
  },
  {
    path: '/coverflowPage',
    name: 'CovorFlowTestPage',
    component: CovorFlowTestPage
  },
  {
    path: '/awesomeSwiperTest',
    name: 'AwesomeSwiperTestPage',
    components: {
      default: AwesomeSwiperTestPage
    }
  },
  {
    path: '/imageGalleryTest',
    name: 'ImageGalleryTestPage',
    components: {
      default: ImageGalleryTestPage
    }
  },
  {
    path: '/calendarTest',
    name: 'CalendarTestPage',
    components: {
      default: CalendarTestPage
    }
  },
  {
    path: '/vueFileUploadTest',
    name: 'VueFileUploadPage',
    components: {
      default: VueFileUploadPage
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
