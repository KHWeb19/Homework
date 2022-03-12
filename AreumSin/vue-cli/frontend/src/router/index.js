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


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomeView',
    component: HomeView
  },
  {
    path: '/testView',
    name: 'Test',
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
    path: 'boardModify/:boardNo',
    name: 'BoardModifyPage',
    component: {
      default: BoardModifyPage,
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
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
