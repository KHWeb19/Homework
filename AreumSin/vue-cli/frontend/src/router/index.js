import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import TestView from "@/views/TestView";
import boardListPage from "@/views/board/BoardListPage";
import BoardRegisterPage from "@/views/board/BoardRegisterPage";


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
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
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
