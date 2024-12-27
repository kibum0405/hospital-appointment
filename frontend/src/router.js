
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AppointmentAppointmentManager from "./components/listers/AppointmentAppointmentCards"
import AppointmentAppointmentDetail from "./components/listers/AppointmentAppointmentDetail"

import ManagementMedicalInformationManager from "./components/listers/ManagementMedicalInformationCards"
import ManagementMedicalInformationDetail from "./components/listers/ManagementMedicalInformationDetail"

import PaymentBillManager from "./components/listers/PaymentBillCards"
import PaymentBillDetail from "./components/listers/PaymentBillDetail"

import NotificationNotificationManager from "./components/listers/NotificationNotificationCards"
import NotificationNotificationDetail from "./components/listers/NotificationNotificationDetail"


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
                path: '/notifications/notifications',
                name: 'NotificationNotificationManager',
                component: NotificationNotificationManager
            },
            {
                path: '/notifications/notifications/:id',
                name: 'NotificationNotificationDetail',
                component: NotificationNotificationDetail
            },



    ]
})
