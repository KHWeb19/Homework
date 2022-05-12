<template>
  <div>
    <member-register-test-form @submit="onSubmit"/>
  </div>
</template>

<script>
import MemberRegisterTestForm from '@/components/jpaMember/MemberRegisterTestForm.vue'
import axios from 'axios'
export default {
  name: "MemberRegisterTestPage.vue",
  components: {
    // eslint-disable-next-line vue/no-unused-components
   MemberRegisterTestForm
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