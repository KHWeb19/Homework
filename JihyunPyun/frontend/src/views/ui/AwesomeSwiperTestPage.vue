<template>
    <v-app id="inspire">
                <swiper class="swiper" :options="swiperOption">
                    <swiper-slide>Slide 1</swiper-slide>
                    <swiper-slide>Slide 2</swiper-slide>
                    <swiper-slide>Slide 3</swiper-slide>
                    <swiper-slide>Slide 4</swiper-slide>
                    <swiper-slide>Slide 5</swiper-slide>
                    <swiper-slide>Slide 6</swiper-slide>
                    <swiper-slide>Slide 7</swiper-slide>
                    <swiper-slide>Slide 8</swiper-slide>
                    <swiper-slide>Slide 9</swiper-slide>
                    <swiper-slide>Slide 10</swiper-slide>
                    <swiper-slide>Slide 11</swiper-slide>
                    <swiper-slide>Slide 12</swiper-slide>
                    <swiper-slide>Slide 13</swiper-slide>
                    <swiper-slide>Slide 14</swiper-slide>
                    <swiper-slide>Slide 15</swiper-slide>
                    <swiper-slide>Slide 16</swiper-slide>
                    <div class="swiper-pagination" slot="pagination">
                    </div>
                </swiper>
    </v-app>
</template>

<script>

import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
import 'swiper/css/swiper.css'

export default {
    name: 'AwesomeSwiperTestPage',
    components: {
        Swiper,
        SwiperSlide
    },
    data () {
        return {
            swiperOption: {
                loop: true, //슬라이드가 계속 반복됨 
                // effect: 'fade', //슬라이드가 어떻게 넘어가게 할것인지 지정
                grabCursor: true, //데스크탑에서 마우스 올리면 커서 보여줌
                centeredSlides: true, //슬라이드 위치 센터로
                slidesPerView: 'auto', // 한번에 보여지는 슬라이드의 숫자
                spaceBetween: 6, // 슬라이드 사이 여백 지정
                slidesOffsetBefore: 0, //슬라이드 왼쪽 여백 (px)
                slidesOffsetAfter: 0, //슬라이드 오른쪽 여백 (px)
            }
        }
    }
}

</script>

<style lang="scss" scoped>

// .slide-3d {
//     width: 100%;
//     height: 400px;
//     padding-top: 50px;
//     padding-bottom: 50px;
// }

// .swiper {
//     height: 100%;
//     width: 100%;
.swiper-container {
  .swiper-wrapper {
    .swiper-slide {
        // display: flex;
        width: auto;
        min-width: 56px;
        padding: 0px 14px;
        line-height: 36px;
        align-items: center;
        text-align: center;
        border: 0;
        border-radius: 18px;
        font-size: 14px;
        background-color:#f3f4f7;
        appearance: none;
        cursor: pointer;
    }
  }
}


</style>