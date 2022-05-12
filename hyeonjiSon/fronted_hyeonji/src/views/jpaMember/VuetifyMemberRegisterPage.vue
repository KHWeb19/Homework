<template>
  <div>
    <div align="center">
      <h2>회원 가입</h2>
    </div>

    <vuetify-member-register-form @submit="onSubmit"/>
    <!--VuetifyMemberRegisterForm 이 작동, submit버튼을 누르면 onSubmit이 실행 -->
  </div>
</template>

<script>
import VuetifyMemberRegisterForm from '@/components/jpaMember/VuetifyMemberRegisterForm.vue'
import axios from 'axios'

export default {
  name: "VuetifyMemberRegisterPage.vue",
  components: {
    // eslint-disable-next-line vue/no-unused-components
    VuetifyMemberRegisterForm
  },
  methods: {
    onSubmit (payload) {
      //payload: commit으로 넘어온 전달인자? 여러개를 묶은 객체 형태로 전달? 중괄호로 묶어서 개체 형태로도 전달 될 수 있다.
      const { id, pw } = payload //이게 중괄호로 묶어서 개체 형태로 전달하는 거네
      //axios.post(url[, data[, config]]) 입력하기
      axios.post('http://localhost:7777/vueJpaMember/register', { id, pw }) //Spring Controller에 연동하여 전달
        .then(res => { //then 정상적으로 데이터를 받았을 경우 동작
          alert('등록 성공! - ' + res)
        })
        .catch(res => { //에러 캐치한 경우 동작
          alert(res.response.data.message)
        })
        //finally 동작 여부와 무관하게 무조건 실행됨
    }
  }
}
</script>

<style scoped>
</style>