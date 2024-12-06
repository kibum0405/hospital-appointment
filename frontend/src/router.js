
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AppointmentAppointmentManager from "./components/listers/AppointmentAppointmentCards"
import AppointmentAppointmentDetail from "./components/listers/AppointmentAppointmentDetail"

import ManagementMedicalInformationManager from "./components/listers/ManagementMedicalInformationCards"
import ManagementMedicalInformationDetail from "./components/listers/ManagementMedicalInformationDetail"

import PaymentBillManager from "./components/listers/PaymentBillCards"
import PaymentBillDetail from "./components/listers/PaymentBillDetail"

import Boundedcontext1353NotificationManager from "./components/listers/Boundedcontext1353NotificationCards"
import Boundedcontext1353NotificationDetail from "./components/listers/Boundedcontext1353NotificationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/appointments/appointments',
                name: 'AppointmentAppointmentManager',
                component: AppointmentAppointmentManager
            },
            {
                path: '/appointments/appointments/:id',
                name: 'AppointmentAppointmentDetail',
                component: AppointmentAppointmentDetail
            },

            {
                path: '/managements/medicalInformations',
                name: 'ManagementMedicalInformationManager',
                component: ManagementMedicalInformationManager
            },
            {
                path: '/managements/medicalInformations/:id',
                name: 'ManagementMedicalInformationDetail',
                component: ManagementMedicalInformationDetail
            },

            {
                path: '/payments/bills',
                name: 'PaymentBillManager',
                component: PaymentBillManager
            },
            {
                path: '/payments/bills/:id',
                name: 'PaymentBillDetail',
                component: PaymentBillDetail
            },

            {
                path: '/boundedcontext1353s/notifications',
                name: 'Boundedcontext1353NotificationManager',
                component: Boundedcontext1353NotificationManager
            },
            {
                path: '/boundedcontext1353s/notifications/:id',
                name: 'Boundedcontext1353NotificationDetail',
                component: Boundedcontext1353NotificationDetail
            },



    ]
})
