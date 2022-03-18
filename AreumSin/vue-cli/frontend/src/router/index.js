import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import TestView from "@/views/TestView";
import boardListPage from "@/views/board/BoardListPage";
import BoardRegisterPage from "@/views/board/BoardRegisterPage";
import BoardReadPage from "@/views/board/BoardReadPage";
import BoardModifyPage from "@/views/board/BoardModifyPage";
import ConcaveView from "@/views/game/ConcaveView";
import EventBusTestPage from '@/views/eventbus/EventBusTestPage.vue'

import ProductBoardListPage from '@/views/productBoard/ProductBoardListPage.vue'
import ProductBoardRegisterPage from '@/views/productBoard/ProductBoardRegisterPage.vue'
import ProductBoardReadPage from '@/views/productBoard/ProductBoardReadPage.vue'
import ProductBoardModifyPage from '@/views/productBoard/ProductBoardModifyPage.vue'

import VuetifyAllInOneTestPage from "@/views/ui/VuetifyAllInOneTestPage";
import VuetifyImageTestPage from "@/views/ui/VuetifyImageTestPage";
import CoverFlowTestPage from "@/views/ui/CoverFlowTestPage";
import AwesomeSwiperTestPage from "@/views/ui/AwesomeSwiperTestPage";
import ImageGalleryTestPage from "@/views/ui/ImageGalleryTestPage";
import CalendarTestPage from "@/views/ui/CalendarTestPage";
import VueFileUploadTestPage from "@/views/fileUpload/VueFileUploadTestPage";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomeView',
    component: HomeView
  },
  {
    path: '/testView',
    name: 'TestView',
    component: TestView
  },
  {
    path: '/BoardList',
    name: 'BoardListPage',
    component: boardListPage
  },
  {
    path: '/boardRegister',
    name: 'BoardRegisterPage',
    component: BoardRegisterPage
  },
  {
    path: '/boardRead/:boardNo',
    name: 'BoardReadPage',
    component: {
      default: BoardReadPage,
    },
    props: {
      default: true
    }
  },
  {
    path: '/boardModify/:boardNo',
    name: 'BoardModifyPage',
    components: {
      default: BoardModifyPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/game/concaveView',
    name: 'Concave',
    component: ConcaveView
  },
  {
    path: '/eventbusTest',
    name: 'EventBusTestPage',
    component: EventBusTestPage
  },
  {
    path: '/productBoardList',
    name: 'ProductBoardListPage',
    component: ProductBoardListPage
  },
  {
    path: '/productBoardRegister',
    name: 'ProductBoardRegisterPage',
    component: ProductBoardRegisterPage
  },
  {
    path: '/productBoardRead/:productNo',
    name: 'ProductBoardReadPage',
    components: {
      default: ProductBoardReadPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/productBoardModify/:productNo',
    name: 'ProductBoardModifyPage',
    components: {
      default: ProductBoardModifyPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/vuetify',
    name: 'VuetifyAllInOneTestPage',
    component: VuetifyAllInOneTestPage
  },
  {
    path: '/vuetifyImageTest',
    name: 'VuetifyImageTestPage',
    component: VuetifyImageTestPage
  },
  {
    path: '/coverFlowTestPage',
    name: 'CoverFlowTestPage',
    component: CoverFlowTestPage
  },
  {
    path: '/awesomeSwiper',
    name: 'AwesomeSwiperTestPage',
    component: AwesomeSwiperTestPage
  },
  {
    path: '/imageGallery',
    name: 'ImageGalleryTestPage',
    component: ImageGalleryTestPage
  },
  {
    path: '/calendar',
    name: 'CalendarTestPage',
    component: CalendarTestPage
  },
  {
    path: '/vueFileUpload',
    name: 'VueFileUploadTestPage',
    component: VueFileUploadTestPage
  }



]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
