import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Test from '@/views/Test.vue'

import BoardListPage from '@/views/board/BoardListPage.vue'
import BoardRegisterPage from '@/views/board/BoardRegisterPage.vue'
import BoardReadPage from '@/views/board/BoardReadPage.vue'
import BoardModifyPage from '@/views/board/BoardModifyPage.vue'

import Concave from '@/views/game/Concave.vue'

import EventBusTestPage from '@/views/eventbus/EventBusTestPage.vue'

import ProductBoardListPage from '@/views/productBoard/ProductBoardListPage.vue'
import ProductBoardRegisterPage from '@/views/productBoard/ProductBoardRegisterPage.vue'
import ProductBoardReadPage from '@/views/productBoard/ProductBoardReadPage.vue'
import ProductBoardModifyPage from '@/views/productBoard/ProductBoardModifyPage.vue'

import Vuetify from '@/views/ui/Vuetify.vue'
import Vuetify2 from '@/views/ui/Vuetify2.vue'
import Vuetify3 from '@/views/ui/Vuetify3.vue'
import Vuetify4 from '@/views/ui/Vuetify4.vue'
import Vuetify5 from '@/views/ui/Vuetify5.vue'
import Calender from '@/views/ui/Calender.vue'

import VueFileUpload from '@/views/fileUpload/VueFileUpload'

import MemberRegisterPage from '@/views/jpaMember/MemberRegisterPage.vue'
import MemberJoinColumnTestPage from '@/views/jpaMember/MemberJoinColumnTestPage.vue'
import LoginTestPage from '@/views/jpaMember/LoginTestPage.vue'

import JpaBoardListPage from '@/views/jpaBoard/JpaBoardListPage.vue'
import JpaBoardRegisterPage from '@/views/jpaBoard/JpaBoardRegisterPage.vue'
import JpaBoardReadPage from '@/views/jpaBoard/JpaBoardReadPage.vue'
import JpaBoardModifyPage from '@/views/jpaBoard/JpaBoardModifyPage.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/test',
    name: 'Test',
    component: Test
  },
  {
    path: '/boardList',
    name: 'BoardListPage',
    component: BoardListPage
  },
  {
    path: '/boardRegister',
    name: 'BoardRegisterPage',
    component: BoardRegisterPage
  },
  {
    path: '/boardRead/:boardNo',
    name: 'BoardReadPage',
    components: {
      default: BoardReadPage
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
    path: '/game/concave',
    name: 'Concave',
    component: Concave
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
    name: 'Vuetify',
    component: Vuetify
  },
  {
    path: '/vuetify2',
    name: 'Vuetify2',
    component: Vuetify2
  },
  {
    path: '/Vuetify3',
    name: 'Vuetify3',
    component: Vuetify3
  },
  {
    path: '/Vuetify4',
    name: 'Vuetify4',
    component: Vuetify4
  },
  {
    path: '/Vuetify5',
    name: 'Vuetify5',
    component: Vuetify5
  },
  {
    path: '/Calender',
    name: 'Calender',
    component: Calender
  },
  {
    path: '/VueFileUpload',
    name: 'VueFileUpload',
    component: VueFileUpload
  },
  {
    path: '/MemberRegisterPage',
    name: 'MemberRegisterPage',
    component: MemberRegisterPage
  },
  {
    path: '/MemberJoinColumnTestPage',
    name: 'MemberJoinColumnTestPage',
    component: MemberJoinColumnTestPage
  },
  {
    path: '/LoginTestPage',
    name: 'LoginTestPage',
    component: LoginTestPage
  },
  {
    path: '/jpaBoardList',
    name: 'JpaBoardListPage',
    component: JpaBoardListPage
  },
  {
    path: '/jpaBoardRegister',
    name: 'JpaBoardRegisterPage',
    component: JpaBoardRegisterPage
  },
  {
    path: '/jpaBoardRead/:boardNo',
    name: 'JpaBoardReadPage',
    components: {
      default: JpaBoardReadPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/jpaBoardModify/:boardNo',
    name: 'JpaBoardModifyPage',
    components: {
      default: JpaBoardModifyPage
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
