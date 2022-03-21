<template>
  <div>
    <div align="center">
      <h2>회원가입</h2>
    </div>

    <member-join-column-test-form @submit="onSubmit" />
  </div>
</template>

<script>
import MemberJoinColumnTestForm from "@/components/jpaMember/MemberJoinColumnTestForm.vue";
import axios from "axios";

export default {
  name: "MemberJoinColumnTestPage",
  components: {
    MemberJoinColumnTestForm,
  },
  methods: {
    onSubmit(payload) {
      const { id, pw, auth } = payload;
      axios
        .post("http://localhost:7777/vueJpaMemberAuth/register", {
          id,
          pw,
          auth,
        })
        .then((res) => {
          alert("등록성공" + res);
        })
        .catch((res) => {
          alert(res.response.data.message);
        });
    },
  },
};
</script>
