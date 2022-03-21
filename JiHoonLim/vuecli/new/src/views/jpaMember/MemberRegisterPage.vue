<template>
  <div>
    <div align="center">
      <h2>회원 가입</h2>
    </div>

    <member-register-form @submit="onSubmit"/>
  </div>
</template>

<script>

import MemberRegisterForm from '@/components/jpaMember/MemberRegisterForm.vue'
import axios from 'axios'

export default {
  name: "MemberRegisterPage.vue",
  components: {
    // eslint-disable-next-line vue/no-unused-components
    MemberRegisterForm
  },
  methods: {
    onSubmit (payload) {
      const { id, pw } = payload
      axios.post('http://localhost:7777/vueJpaMember/register', { id, pw })
        .then(res => {
          alert('등록 성공! - ' + res)
        })
        .catch(res => {
          alert(res.response.data.message)
        })
    }
  }
}

</script>

<style scoped>

</style>