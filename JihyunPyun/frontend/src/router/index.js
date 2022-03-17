import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Test from '@/views/Test.vue'

import BoardListPage from '@/views/board/BoardListPage.vue'
import BoardRegisterPage from '@/views/board/BoardRegisterPage.vue'
import CoverFlowTestPage from '@/views/ui/CoverFlowTestPage.vue'
import AwesomeSwiperTestPage from '@/views/ui/AwesomeSwiperTestPage.vue'


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
      path: '/coverFlowTest',
      name: 'CoverFlowTestPage',
      component: CoverFlowTestPage
    },
    {
      path: '/awesomeSwiperTest',
      name: 'AwesomeSwiperTestPage',
      components: {
        default: AwesomeSwiperTestPage
      }
    }
  ]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
