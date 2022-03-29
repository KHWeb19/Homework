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

import VuetifyAllInOneTestPage from '@/views/ui/VuetifyAllInOneTestPage.vue'
import VuetifyImageTestPage from '@/views/ui/VuetifyImageTestPage.vue'
import CoverFlowTestPage from '@/views/ui/CoverFlowTestPage.vue'
import AwesomeSwiperTestPage from '@/views/ui/AwesomeSwiperTestPage.vue'

import ImageGalleryTestPage from '@/views/ui/ImageGalleryTestPage.vue'
import CalenderTestPage from '@/views/ui/CalenderTestPage.vue'

import VueFileUploadTestPage from '@/views/fileUpload/VueFileUploadTestPage.vue'

import VuetifyMemberRegisterPage from '@/views/jpaMember/VuetifyMemberRegisterPage.vue'
import VuetifyMemberJoinColumnTestPage from '@/views/jpaMember/VuetifyMemberJoinColumnTestPage.vue'
import LoginTestPage from '@/views/jpaMember/LoginTestPage.vue'

import JpaBoardListPage from '@/views/jpaBoard/JpaBoardListPage.vue'
import JpaBoardRegisterPage from '@/views/jpaBoard/JpaBoardRegisterPage.vue'
import JpaBoardReadPage from '@/views/jpaBoard/JpaBoardReadPage.vue'
import JpaBoardModifyPage from '@/views/jpaBoard/JpaBoardModifyPage.vue'

import JpaMemberAuthTestPage from '@/views/jpaMember/JpaMemberAuthTestPage.vue'

import DaumNewsCrawlerPage from '@/views/crawl/DaumNewsCrawlerPage.vue'

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
    path: '/coverFlowTest',
    name: 'CoverFlowTestPage',
    components: {
      default: CoverFlowTestPage
    }
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
    path: '/calenderTest',
    name: 'CalenderTestPage',
    components: {
      default: CalenderTestPage
    }
  }
  ,
  {
    path: '/vueFileUploadTest',
    name: 'VueFileUploadTestPage',
    components: {
      default: VueFileUploadTestPage
    }
  },
  {
    path: '/vuetifyMemberRegisterTest',
    name: 'VuetifyMemberRegisterPage',
    components: {
      default: VuetifyMemberRegisterPage
    }
  },
  {
    path: '/vuetifyMemberJoinColumnTest',
    name: 'VuetifyMemberJoinColumnTestPage',
    components: {
      default: VuetifyMemberJoinColumnTestPage
    }
  },
  {
    path: '/login',
    name: 'LoginTestPage',
    components: {
      default: LoginTestPage
    }
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
  },
  {
    path: '/jpaMemberAuthTest',
    name: 'JpaMemberAuthTestPage',
    components: {
      default: JpaMemberAuthTestPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/daumNewsCrawl',
    name: 'DaumNewsCrawlerPage',
    components: {
      default: DaumNewsCrawlerPage
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